package com.adobe.aem.guides.wknd.core.models;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.*;

@Model(adaptables = SlingHttpServletRequest.class,
       adapters = Author.class,
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class AuthorImpl implements Author{

	@Inject
	@Via("resource")
    private String fname;

	@ValueMapValue
    private String lname;

    @Inject
    @Via("resource")
    private boolean professor;
	
	   @Override
	    public String getFirstName() {
	        return fname;
	    }

	    @Override
	    public String getLastName() {
	        return lname;
	    }

	    @Override
	    public boolean getIsProfessor() {
	        return professor;
	    }
}
