package dev.iamtj.photogramusermanagementservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRole extends BaseModel {

    private String name;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public UserRole(String name) {
        this.name = name;
    }

}
