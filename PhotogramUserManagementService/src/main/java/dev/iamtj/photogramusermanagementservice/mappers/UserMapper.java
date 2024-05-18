package dev.iamtj.photogramusermanagementservice.mappers;

import dev.iamtj.photogramusermanagementservice.dtos.UserRegisterRequest;
import dev.iamtj.photogramusermanagementservice.dtos.UserRegisterResponse;
import dev.iamtj.photogramusermanagementservice.models.User;
import dev.iamtj.photogramusermanagementservice.models.UserRole;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", imports = {UserRole.class, java.util.Collections.class})
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);


    @Mapping(target = "username", source = "email", qualifiedByName = "extractUsername")
    @Mapping(target = "roles", expression = "java(Collections.singleton(new UserRole(\"ROLE_USER\")))")
    User toUser(UserRegisterRequest userRegisterRequest);


    @Mapping(target = "message", expression = "java(\"User with email: \" + email + \" successfully registered!\")")
    UserRegisterResponse fromUser(User user);

    @Named("extractUsername")
    default String extractUsername(String email) {
        int atIndex = email.indexOf("@");
        if (atIndex != -1) {
            return email.substring(0, atIndex);
        }
        return "";
    }

}
