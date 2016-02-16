package bac.service;

import bac.dto.DtoList;
import bac.dto.UserDto;
import bac.exception.ServiceException;

/**
 * Created by max on 13/02/16.
 */
public interface UserService {

    UserDto create(UserDto toCreate) throws ServiceException;
    UserDto read(UserDto toRead) throws ServiceException;
    UserDto update(UserDto toUpdate) throws ServiceException;
    UserDto delete(UserDto toDelete) throws ServiceException;

    DtoList<UserDto> readAll() throws ServiceException;
}
