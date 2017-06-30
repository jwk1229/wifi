/*
 * WiFiAnalyzer
 * Copyright (C) 2017  VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.vrem.wifianalyzer.wifi.accesspoint;

import android.util.Log;

import com.vrem.wifianalyzer.R;

public enum AccessPointViewType {
    COMPLETE(R.layout.access_point_view_complete),
    COMPACT(R.layout.access_point_view_compact);

    static final String TAG = "log";

    private final int layout;

    AccessPointViewType(int layout) {
        this.layout = layout;
    }

    int getLayout() {
        return layout;
    }

    boolean isCompact() {
        Log.d(TAG, "isCompact() : 실행" + COMPACT.equals(this));
        return COMPACT.equals(this);
    }

    boolean isFull() {
        Log.d(TAG, "isFull() : 실행" + COMPLETE.equals(this));
        return COMPLETE.equals(this);
    }
}
