package igor.qualifiers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.*;
@Qualifier
@Target({FIELD, METHOD, TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface USA {}
