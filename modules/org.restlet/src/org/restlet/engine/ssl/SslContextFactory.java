/**
 * Copyright 2005-2014 Restlet S.A.S.
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL
 * 1.0 (the "Licenses"). You can select the license that you prefer but you may
 * not use this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1
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

package org.restlet.engine.ssl;

import javax.net.ssl.SSLContext;

import org.restlet.data.Parameter;
import org.restlet.util.Series;

/**
 * This is an abstract factory that produces configured and initialized
 * instances of SSLContext. Concrete implementations of SslContextFactory must
 * implement {@link #createSslContext()}, which should typically consist of:
 * 
 * <pre>
 *    SSLContext sslContext = SSLContext.getInstance(...);
 *    ...
 *    sslContext.init(..., ..., ...);
 *    return sslContext;
 * </pre>
 * 
 * @author Bruno Harbulot (Bruno.Harbulot@manchester.ac.uk)
 * @see SSLContext
 */
public abstract class SslContextFactory {

    /**
     * Creates a configured and initialized SSLContext.
     * 
     * @return A configured and initialized SSLContext.
     * @throws Exception
     */
    public abstract SSLContext createSslContext() throws Exception;

    /**
     * Initialize the factory with the given connector parameters.
     * 
     * @param parameters
     *            The connector parameters.
     */
    public abstract void init(Series<Parameter> parameters);
}
