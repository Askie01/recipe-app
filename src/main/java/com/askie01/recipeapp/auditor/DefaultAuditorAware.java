package com.askie01.recipeapp.auditor;

import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("defaultAuditorAware")
@Profile("default")
public class DefaultAuditorAware implements AuditorAware<String> {
    /**
     * Returns the current auditor of the application.
     *
     * @return the current auditor.
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("RECIPE_SERVICE");
    }
}
