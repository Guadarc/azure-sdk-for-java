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

package com.microsoft.azure.management.sql;

import com.microsoft.azure.management.sql.models.DatabaseAuditingPolicyCreateOrUpdateParameters;
import com.microsoft.azure.management.sql.models.DatabaseAuditingPolicyGetResponse;
import com.microsoft.azure.management.sql.models.ServerAuditingPolicyCreateOrUpdateParameters;
import com.microsoft.azure.management.sql.models.ServerAuditingPolicyGetResponse;
import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import java.io.IOException;
import java.util.concurrent.Future;

/**
* Represents all the operations to manage Azure SQL Database and Database
* Server Audit policy.  Contains operations to: Create, Retrieve and Update
* audit policy.
*/
public interface AuditingPolicyOperations {
    /**
    * Creates or updates an Azure SQL Database auditing policy.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which the auditing policy applies.
    * @param parameters Required. The required parameters for createing or
    * updating a Azure SQL Database auditing policy.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse createOrUpdateDatebasePolicy(String resourceGroupName, String serverName, String databaseName, DatabaseAuditingPolicyCreateOrUpdateParameters parameters) throws IOException, ServiceException;
    
    /**
    * Creates or updates an Azure SQL Database auditing policy.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which the auditing policy applies.
    * @param parameters Required. The required parameters for createing or
    * updating a Azure SQL Database auditing policy.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> createOrUpdateDatebasePolicyAsync(String resourceGroupName, String serverName, String databaseName, DatabaseAuditingPolicyCreateOrUpdateParameters parameters);
    
    /**
    * Creates or updates an Azure SQL Database Server auditing policy.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param parameters Required. The required parameters for createing or
    * updating a Azure SQL Database Server auditing policy.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse createOrUpdateServerPolicy(String resourceGroupName, String serverName, ServerAuditingPolicyCreateOrUpdateParameters parameters) throws IOException, ServiceException;
    
    /**
    * Creates or updates an Azure SQL Database Server auditing policy.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param parameters Required. The required parameters for createing or
    * updating a Azure SQL Database Server auditing policy.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> createOrUpdateServerPolicyAsync(String resourceGroupName, String serverName, ServerAuditingPolicyCreateOrUpdateParameters parameters);
    
    /**
    * Returns an Azure SQL Database auditing policy.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which the auditing policy applies.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the response to a get database auditing policy request.
    */
    DatabaseAuditingPolicyGetResponse getDatabasePolicy(String resourceGroupName, String serverName, String databaseName) throws IOException, ServiceException;
    
    /**
    * Returns an Azure SQL Database auditing policy.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which the auditing policy applies.
    * @return Represents the response to a get database auditing policy request.
    */
    Future<DatabaseAuditingPolicyGetResponse> getDatabasePolicyAsync(String resourceGroupName, String serverName, String databaseName);
    
    /**
    * Returns an Azure SQL Database server auditing policy.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the response to a get database auditing policy request.
    */
    ServerAuditingPolicyGetResponse getServerPolicy(String resourceGroupName, String serverName) throws IOException, ServiceException;
    
    /**
    * Returns an Azure SQL Database server auditing policy.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @return Represents the response to a get database auditing policy request.
    */
    Future<ServerAuditingPolicyGetResponse> getServerPolicyAsync(String resourceGroupName, String serverName);
}
