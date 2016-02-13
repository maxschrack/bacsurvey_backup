package bac.converter;

import bac.dto.UserDto;
import bac.model.User;
import bac.repository.UserRepository;

/**
 * Created by max on 13/02/16.
 */
public class UserConverter extends Converter<UserDto, User> {

    private UserRepository userRepository;

    public UserConverter(){

    }

    @Override
    public UserDto newDto() {
        return new UserDto();
    }

    @Override
    public User newEntity() {
        return new User();
    }

    public UserDto toDto(User entity){
        UserDto userDto = super.toDto(entity);

        return userDto;
    }

    public User toEntity(UserDto dto){
        User entity = super.toEntity(dto);

        return entity;
    }
}
