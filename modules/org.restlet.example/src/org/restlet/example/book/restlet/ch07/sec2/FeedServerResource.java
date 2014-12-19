/**
 * Copyright 2005-2014 Restlet
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or or EPL 1.0 (the "Licenses"). You can
 * select the license that you prefer but you may not use this file except in
 * compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://restlet.com/products/restlet-framework
 * 
 * Restlet is a registered trademark of Restlet S.A.S.
 */

package org.restlet.example.book.restlet.ch07.sec2;

import org.restlet.ext.atom.Entry;
import org.restlet.ext.atom.Feed;
import org.restlet.ext.atom.Text;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

/**
 * Resource corresponding to an account feed associated to tags.
 */
public class FeedServerResource extends ServerResource {

    @Get("atom")
    public Feed toAtom() throws ResourceException {
        Feed result = new Feed();
        result.setTitle(new Text("Homer's feed"));
        Entry entry;

        for (int i = 1; i < 11; i++) {
            entry = new Entry();
            entry.setTitle(new Text("Mail #" + i));
            entry.setSummary("Doh! This is the content of mail #" + i);
            result.getEntries().add(entry);
        }

        return result;
    }

}
