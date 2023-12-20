package steps.database;

import constants.Queries;
import models.database.ProjectDao;
import utils.ResultSetUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectSteps extends BaseSteps {

    public ProjectDao getProjectByName(String name) {
        String query = String.format(Queries.GET_PROJECT_BY_NAME.getQuery(), name);
        try (ResultSet resultSet = select(query)) {
            return ResultSetUtils.mapToProject(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Long addProject(ProjectDao project) {
        String name = project.getName();
        try {
            ResultSet resultSet = insert(Queries.ADD_PROJECT.getQuery(), name);
            resultSet.next();
            return resultSet.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
