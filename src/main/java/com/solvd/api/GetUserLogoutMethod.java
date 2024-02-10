package com.solvd.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;


@Endpoint(url = "${config.api_url}/user/logout", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/user/_gets/user_login_response.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetUserLogoutMethod extends AbstractApiMethodV2 {
    public GetUserLogoutMethod() {
        ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }

}

