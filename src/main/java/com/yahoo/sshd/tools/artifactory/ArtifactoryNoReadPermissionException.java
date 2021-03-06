/*
 * Copyright 2014 Yahoo! Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the License); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an AS IS BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.yahoo.sshd.tools.artifactory;

import org.apache.sshd.common.file.SshFile;

import com.yahoo.sshd.server.logging.SshRequestStatus;


public class ArtifactoryNoReadPermissionException extends ArtifactoryIOException {

    private static final long serialVersionUID = 1L;

    public ArtifactoryNoReadPermissionException(String message) {
        super(message, null);
    }

    public ArtifactoryNoReadPermissionException(String message, SshFile file) {
        super(message, file);
    }

    @Override
    public int getStatusCode() {
        return SshRequestStatus.FORBIDDEN.getStatusCode();
    }
}
