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

package com.microsoft.windowsazure.management.compute.models;

import java.net.URI;

/**
* The parameters Azure uses to create the operating system disk for the virtual
* machine.
*/
public class OSVirtualHardDisk {
    private String hostCaching;
    
    /**
    * Optional. Specifies the platform caching behavior of the operating system
    * disk blob for read/write efficiency.
    * @return The HostCaching value.
    */
    public String getHostCaching() {
        return this.hostCaching;
    }
    
    /**
    * Optional. Specifies the platform caching behavior of the operating system
    * disk blob for read/write efficiency.
    * @param hostCachingValue The HostCaching value.
    */
    public void setHostCaching(final String hostCachingValue) {
        this.hostCaching = hostCachingValue;
    }
    
    private String iOType;
    
    /**
    * Optional. Gets or sets the IO type.
    * @return The IOType value.
    */
    public String getIOType() {
        return this.iOType;
    }
    
    /**
    * Optional. Gets or sets the IO type.
    * @param iOTypeValue The IOType value.
    */
    public void setIOType(final String iOTypeValue) {
        this.iOType = iOTypeValue;
    }
    
    private String label;
    
    /**
    * Optional. Specifies the friendly name of an operating system image in the
    * image repository.
    * @return The Label value.
    */
    public String getLabel() {
        return this.label;
    }
    
    /**
    * Optional. Specifies the friendly name of an operating system image in the
    * image repository.
    * @param labelValue The Label value.
    */
    public void setLabel(final String labelValue) {
        this.label = labelValue;
    }
    
    private URI mediaLink;
    
    /**
    * Optional. Specifies the location of the operating system disk in Azure
    * storage.
    * @return The MediaLink value.
    */
    public URI getMediaLink() {
        return this.mediaLink;
    }
    
    /**
    * Optional. Specifies the location of the operating system disk in Azure
    * storage.
    * @param mediaLinkValue The MediaLink value.
    */
    public void setMediaLink(final URI mediaLinkValue) {
        this.mediaLink = mediaLinkValue;
    }
    
    private String name;
    
    /**
    * Optional. Specifies the name of an operating system image in the image
    * repository.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Specifies the name of an operating system image in the image
    * repository.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String operatingSystem;
    
    /**
    * Optional. The operating system running in the virtual machine.
    * @return The OperatingSystem value.
    */
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    
    /**
    * Optional. The operating system running in the virtual machine.
    * @param operatingSystemValue The OperatingSystem value.
    */
    public void setOperatingSystem(final String operatingSystemValue) {
        this.operatingSystem = operatingSystemValue;
    }
    
    private URI remoteSourceImageLink;
    
    /**
    * Optional. Uri of the source OS image that will be copied to the
    * customer’s storage account of VM creation.If RemoteSourceImageLink is
    * specified, then MediaLink must also be specified.If
    * RemoteSourceImageLink is specified, thenSourceIamgeName must not be
    * specified.
    * @return The RemoteSourceImageLink value.
    */
    public URI getRemoteSourceImageLink() {
        return this.remoteSourceImageLink;
    }
    
    /**
    * Optional. Uri of the source OS image that will be copied to the
    * customer’s storage account of VM creation.If RemoteSourceImageLink is
    * specified, then MediaLink must also be specified.If
    * RemoteSourceImageLink is specified, thenSourceIamgeName must not be
    * specified.
    * @param remoteSourceImageLinkValue The RemoteSourceImageLink value.
    */
    public void setRemoteSourceImageLink(final URI remoteSourceImageLinkValue) {
        this.remoteSourceImageLink = remoteSourceImageLinkValue;
    }
    
    private Integer resizedSizeInGB;
    
    /**
    * Optional. When an OS Image or a RemoteSourceImage is used to create an
    * OSVirtualHardDisk, this parameter can be used to resize the new
    * OSVirtualHardDisk to a larger size. ResizedSizeInGB must be larger than
    * the underlying OS Image’s LogicalSizeInGB.
    * @return The ResizedSizeInGB value.
    */
    public Integer getResizedSizeInGB() {
        return this.resizedSizeInGB;
    }
    
    /**
    * Optional. When an OS Image or a RemoteSourceImage is used to create an
    * OSVirtualHardDisk, this parameter can be used to resize the new
    * OSVirtualHardDisk to a larger size. ResizedSizeInGB must be larger than
    * the underlying OS Image’s LogicalSizeInGB.
    * @param resizedSizeInGBValue The ResizedSizeInGB value.
    */
    public void setResizedSizeInGB(final Integer resizedSizeInGBValue) {
        this.resizedSizeInGB = resizedSizeInGBValue;
    }
    
    private String sourceImageName;
    
    /**
    * Optional. Specifies the name of the source image that was used to
    * provision the virtual machine.
    * @return The SourceImageName value.
    */
    public String getSourceImageName() {
        return this.sourceImageName;
    }
    
    /**
    * Optional. Specifies the name of the source image that was used to
    * provision the virtual machine.
    * @param sourceImageNameValue The SourceImageName value.
    */
    public void setSourceImageName(final String sourceImageNameValue) {
        this.sourceImageName = sourceImageNameValue;
    }
}
