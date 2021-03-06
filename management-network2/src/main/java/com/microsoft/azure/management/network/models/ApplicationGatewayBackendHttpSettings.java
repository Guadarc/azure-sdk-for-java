/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.network.models;

/**
* Backend address pool settings of application gateway
*/
public class ApplicationGatewayBackendHttpSettings extends ChildResource {
    private String cookieBasedAffinity;
    
    /**
    * Optional. Gets or sets the cookie affinity
    * @return The CookieBasedAffinity value.
    */
    public String getCookieBasedAffinity() {
        return this.cookieBasedAffinity;
    }
    
    /**
    * Optional. Gets or sets the cookie affinity
    * @param cookieBasedAffinityValue The CookieBasedAffinity value.
    */
    public void setCookieBasedAffinity(final String cookieBasedAffinityValue) {
        this.cookieBasedAffinity = cookieBasedAffinityValue;
    }
    
    private int port;
    
    /**
    * Optional. Gets or sets the port
    * @return The Port value.
    */
    public int getPort() {
        return this.port;
    }
    
    /**
    * Optional. Gets or sets the port
    * @param portValue The Port value.
    */
    public void setPort(final int portValue) {
        this.port = portValue;
    }
    
    private String protocol;
    
    /**
    * Optional. Gets or sets the protocol
    * @return The Protocol value.
    */
    public String getProtocol() {
        return this.protocol;
    }
    
    /**
    * Optional. Gets or sets the protocol
    * @param protocolValue The Protocol value.
    */
    public void setProtocol(final String protocolValue) {
        this.protocol = protocolValue;
    }
    
    private String provisioningState;
    
    /**
    * Optional. Gets or sets Provisioning state of the backend http settings
    * resource Updating/Deleting/Failed
    * @return The ProvisioningState value.
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    
    /**
    * Optional. Gets or sets Provisioning state of the backend http settings
    * resource Updating/Deleting/Failed
    * @param provisioningStateValue The ProvisioningState value.
    */
    public void setProvisioningState(final String provisioningStateValue) {
        this.provisioningState = provisioningStateValue;
    }
}
