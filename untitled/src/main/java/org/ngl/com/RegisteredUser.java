package org.ngl.com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisteredUser extends User{
    public String lastName;
    public String firstName;
    public String email;
}
