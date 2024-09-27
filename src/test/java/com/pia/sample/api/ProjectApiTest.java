/*
 * Bill Formatter
 * BEAS Bill Formatter
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.pia.sample.api;

import com.pia.openapi.invoker.ApiException;
import com.pia.sample.model.Project;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * API tests for ProjectApi
 */
@Disabled
public class ProjectApiTest {

    private final ProjectApi api = new ProjectApi();

    /**
     * Create a project (Project) to receive Events
     *
     * create a new Project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectTest() throws ApiException {
        Project project = null;
        String fields = null;
        Integer offset = null;
        Integer limit = null;
        Project response = api.createProject(project, fields, offset, limit);
        // TODO: test validations
    }

}
