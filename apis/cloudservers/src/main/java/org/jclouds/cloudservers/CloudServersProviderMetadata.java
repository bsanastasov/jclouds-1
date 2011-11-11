/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.cloudservers;

import java.net.URI;

import org.jclouds.providers.BaseProviderMetadata;
import org.jclouds.providers.ProviderMetadata;

/**
* Common implementation of {@link org.jclouds.types.ProviderMetadata} for Rackspace Cloud Servers.
* 
* @author Dan Lo Bianco
*/
public abstract class CloudServersProviderMetadata extends BaseProviderMetadata {

	public CloudServersProviderMetadata() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getType() {
		return ProviderMetadata.COMPUTE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getIdentityName() {
		return "Username";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getCredentialName() {
		return "API Key";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public URI getApiDocumentation() {
		return URI.create("http://docs.rackspacecloud.com/servers/api/v1.0/cs-devguide/content/ch01.html");
	}

}