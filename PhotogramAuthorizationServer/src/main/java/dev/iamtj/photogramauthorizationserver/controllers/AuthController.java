package dev.iamtj.photogramauthorizationserver.controllers;

/*
    Authentication:
    POST /api/auth/login - Authenticate a user and generate an access token.
    POST /api/auth/logout - Logout and invalidate the access token.
    Token Management:
    POST /api/auth/token/refresh - Refresh an expired access token.
    POST /api/auth/token/validate - Validate the access token.
    User Authorization:
    GET /api/auth/permissions - Retrieve user permissions.
    GET /api/auth/roles - Retrieve user roles.
    GET /api/auth/roles/{roleId}/permissions - Retrieve permissions associated with a role.
*/
public class AuthController {

}
