package com.publiccms.common.tools;

import java.io.IOException;

import com.publiccms.common.api.Json;
import com.publiccms.common.base.Base;

/**
 * 
 * JsonUtils
 * 
 */
public final class JsonUtils extends Base implements Json {

    /**
     * @param object
     * @return
     */
    public static String getString(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (IOException e) {
            return null;
        }
    }
}