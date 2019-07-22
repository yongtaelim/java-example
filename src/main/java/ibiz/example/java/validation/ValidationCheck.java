package ibiz.example.java.validation;

import java.util.Collection;
import java.util.Objects;

import org.springframework.util.CollectionUtils;

public class ValidationCheck {
	public boolean isEmptyCollection(Collection<?> collection) {
		return CollectionUtils.isEmpty(collection);
	}
	
	public boolean objectRequire(Object object) {
		return Objects.requireNonNull(object, "object is null...") != null;
	}
	
}
