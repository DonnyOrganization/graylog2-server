/**
 * Copyright 2012 Lennart Koopmann <lennart@socketfeed.com>
 *
 * This file is part of Graylog2.
 *
 * Graylog2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Graylog2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Graylog2.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.graylog2.periodical;

import org.graylog2.Core;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author Lennart Koopmann <lennart@socketfeed.com>
 */
public class AlertScannerThread implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(AlertScannerThread.class);
    
    public static final int INITIAL_DELAY = 10;
    public static final int PERIOD = 60;
    
    private final Core graylogServer;
    
    public AlertScannerThread(Core graylogServer) {
        this.graylogServer = graylogServer;
    }
    
    @Override
    public void run() {
        LOG.debug("Running alert checks.");
    }

}
