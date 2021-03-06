package org.wso2.carbon.auth.oauth.rest.api;

import org.wso2.carbon.auth.oauth.rest.api.*;
import org.wso2.carbon.auth.oauth.rest.api.dto.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;
import org.wso2.msf4j.Request;

import org.wso2.carbon.auth.oauth.rest.api.dto.TokenErrorResponseDTO;
import org.wso2.carbon.auth.oauth.rest.api.dto.TokenResponseDTO;

import java.util.List;
import org.wso2.carbon.auth.oauth.rest.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public abstract class TokenApiService {
    public abstract Response tokenPost(String authorization
 ,String grantType
 ,String code
 ,String redirectUri
 ,String clientId
 ,String refreshToken
 ,String scope
  ,Request request) throws NotFoundException;
}
