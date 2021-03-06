package skadistats.clarity.parser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.google.protobuf.GeneratedMessage;

@Retention(RetentionPolicy.RUNTIME)
@Target(value=ElementType.TYPE)
public @interface RegisterHandler {

    Class<? extends GeneratedMessage> value();
    
}
