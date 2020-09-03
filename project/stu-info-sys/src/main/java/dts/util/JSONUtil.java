package dts.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;

public class JSONUtil {
    //jackson框架提供处理Json的类
    private static final ObjectMapper M = new ObjectMapper();
    static {
        //设置序列号和反序列化的日期格式
        M.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }
    //反序列化json字符串为Java对象
    public static <T> T read(InputStream is,Class<T> clazz){
        try {
            return M.readValue(is,clazz);
        } catch (IOException e) {
           throw new RuntimeException("json反序列化失败，传入的数据格式和class类型不匹配",e);
        }
    }
    //序列化Java对象为Jason字符串
    public static String write(Object o){
        try {
            return M.writerWithDefaultPrettyPrinter().writeValueAsString(o);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("json序列化失败",e);
        }
    }
}
