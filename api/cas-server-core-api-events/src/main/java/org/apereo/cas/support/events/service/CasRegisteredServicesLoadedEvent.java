package org.apereo.cas.support.events.service;

import org.apereo.cas.services.RegisteredService;
import org.apereo.cas.support.events.AbstractCasEvent;

import java.util.Collection;

/**
 * This is {@link CasRegisteredServicesLoadedEvent} that is signaled
 * when registered service are loaded into the CAS registry.
 *
 * @author Misagh Moayyed
 * @since 5.1.0
 */
public class CasRegisteredServicesLoadedEvent extends AbstractCasEvent {

    private static final long serialVersionUID = 291168299712263298L;

    private final Collection<RegisteredService> services;
    
    /**
     * Instantiates a new cas sso event.
     *
     * @param source the source
     * @param services
     */
    public CasRegisteredServicesLoadedEvent(final Object source, final Collection<RegisteredService> services) {
        super(source);
        this.services = services;
    }

    public Collection<RegisteredService> getServices() {
        return services;
    }
}