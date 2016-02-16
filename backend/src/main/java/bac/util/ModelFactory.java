package bac.util;

import bac.dto.EntityDto;
import bac.dto.QuestionnaireDto;
import bac.dto.UserDto;
import bac.rest.EntityModelRest;
import bac.rest.QuestionnaireRest;
import bac.rest.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by max on 16/02/16.
 */
public class ModelFactory {
    @Value("${config.url.context}")
    private static String baseUrl;
    @Value("${config.context}")
    private static String context;
    @Value("${config.build}")
    private static String buildNumber;
    @Value("${config.build}")
    private static String version;
    @Value("${full-version}")
    private static String fullVersion;
    @Value("${config.api.version}")
    private static String apiVersion;

    public static UserRest user(UserDto dto) {
        UserRest userRest = new UserRest();
        setValuesFromDto(dto, userRest);
        return userRest;
    }

    public static QuestionnaireRest questionnaire(QuestionnaireDto dto) {
        QuestionnaireRest userRest = new QuestionnaireRest();
        setValuesFromDto(dto, userRest);
        return userRest;
    }

    private static void setValuesFromDto(EntityDto from, EntityModelRest to) {
        BeanUtils.copyProperties(from, to);
        to.setSelfId(from.getId());
    }
}
