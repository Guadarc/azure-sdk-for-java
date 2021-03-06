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

package com.microsoft.azure.management.compute.models;

/**
* Virtual machine image resource information.
*/
public class VirtualMachineImageResource {
    private String id;
    
    /**
    * Required. Gets or sets the ID of the artifact.
    * @return The Id value.
    */
    public String getId() {
        return this.id;
    }
    
    /**
    * Required. Gets or sets the ID of the artifact.
    * @param idValue The Id value.
    */
    public void setId(final String idValue) {
        this.id = idValue;
    }
    
    private String location;
    
    /**
    * Required. Gets or sets the location of the resource.
    * @return The Location value.
    */
    public String getLocation() {
        return this.location;
    }
    
    /**
    * Required. Gets or sets the location of the resource.
    * @param locationValue The Location value.
    */
    public void setLocation(final String locationValue) {
        this.location = locationValue;
    }
    
    private String name;
    
    /**
    * Required. Gets or sets the name of the resource.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Required. Gets or sets the name of the resource.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    /**
    * Initializes a new instance of the VirtualMachineImageResource class.
    *
    */
    public VirtualMachineImageResource() {
    }
    
    /**
    * Initializes a new instance of the VirtualMachineImageResource class with
    * required arguments.
    *
    * @param id Gets or sets the ID of the artifact.
    * @param name Gets or sets the name of the resource.
    * @param location Gets or sets the location of the resource.
    */
    public VirtualMachineImageResource(String id, String name, String location) {
        if (id == null) {
            throw new NullPointerException("id");
        }
        if (name == null) {
            throw new NullPointerException("name");
        }
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setId(id);
        this.setName(name);
        this.setLocation(location);
    }
}
