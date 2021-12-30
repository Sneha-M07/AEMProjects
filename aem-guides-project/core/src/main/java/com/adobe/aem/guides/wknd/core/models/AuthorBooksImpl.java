package com.adobe.aem.guides.wknd.core.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.*;

@Model(adaptables=SlingHttpServletRequest.class,
       adapters=AuthorBooks.class,
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
     )
public class AuthorBooksImpl implements AuthorBooks{
	
	@Inject
	Resource componentResource;

	@ValueMapValue
    private String authorname;
	
	@ValueMapValue
    private List<String> books;

	@ValueMapValue
    private List<Map<String,String>> bookdetailswithmap;

    @Override
    public String getAuthorName() {
        return authorname;
    }

	
	@Override
	public List<String> getAuthorBooks(){
		if(books!=null) {
			return new ArrayList<String>(books);
		}
		else {
		   return Collections.emptyList();	
		}
	}
	
}
