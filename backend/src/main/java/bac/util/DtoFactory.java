package bac.util;

import bac.dto.EntityDto;
import bac.dto.QuestionnaireDto;
import bac.dto.UserDto;
import bac.rest.EntityModelRest;
import bac.rest.QuestionnaireRest;
import bac.rest.UserRest;
import org.springframework.beans.BeanUtils;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class DtoFactory {

    private static final Map<Class, Class> MAPPINGS;

    static {
        Map<Class, Class> aMap = new LinkedHashMap<>();
        aMap.put(UserRest.class, UserDto.class);
        aMap.put(QuestionnaireRest.class, QuestionnaireDto.class);
        MAPPINGS = Collections.unmodifiableMap(aMap);
    }

    /**
     * Converts the rest model to a dto model.
     * ATTENTION: If you use the DtoFactory and require additional attributes to be set,
     * you must to implement your own method!
     *
     * @param model - model to be converted
     * @param <E>   - class of the expected dto, taken from MAPPINGS
     * @return - dto object containing all attributes passed by the rest model, WITHOUT an ID.
     */
    public static <E extends EntityDto> E toDto(EntityModelRest model) {
        Class clazz = MAPPINGS.get(model.getClass());
        E dto;
        try {
            dto = (E) clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        BeanUtils.copyProperties(model, dto);
        dto.setId(null);
        return dto;
    }
}