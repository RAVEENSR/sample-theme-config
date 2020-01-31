/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package sample.analytics.apim.dashboards.theme.config.provider;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wso2.carbon.dashboards.core.DashboardThemeConfigProvider;
import org.wso2.carbon.dashboards.core.exception.DashboardException;


/**
 * Default implementation for Default Dashboard Theme Config Provider.
 */
@Component(
        service = DashboardThemeConfigProvider.class,
        immediate = true
)
public class CustomDashboardThemeConfigProvider implements DashboardThemeConfigProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomDashboardThemeConfigProvider.class);

    @Override
    public String getLogoPath(String username) throws DashboardException {
        String logoPath = "logo.clearbit.com/spotify.com";
        LOGGER.debug("Custom logo path returned via '{}' class for user: '{}.'", this.getClass().getName(), username);
        return logoPath;
    }
}
