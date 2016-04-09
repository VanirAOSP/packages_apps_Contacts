/*
 * Copyright (C) 2016 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.contacts.incall;

import android.app.IntentService;
import android.content.Intent;


public class InCallMetricsService extends IntentService {
    static final String TAG = InCallMetricsService.class.getSimpleName();
    private static final boolean DEBUG = true;

    public InCallMetricsService () {
        super(InCallMetricsService.class.getSimpleName());
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        InCallMetricsHelper.prepareAndSend(this);
    }
}