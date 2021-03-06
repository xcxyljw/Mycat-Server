/*
 * Copyright (c) 2013, OpenCloudDB/MyCAT and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software;Designed and Developed mainly by many Chinese 
 * opensource volunteers. you can redistribute it and/or modify it under the 
 * terms of the GNU General Public License version 2 only, as published by the
 * Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Any questions about this component can be directed to it's project Web address 
 * https://code.google.com/p/opencloudb/.
 *
 */
package io.mycat.net.postgres;

/**
 * <pre>
 * DataRow (B) 
 * Byte1('D') Identifies the message as a data row. 
 * Int32 Length of message contents in bytes, including self. 
 * Int16 The number of column values that follow (possibly zero). 
 *       Next, the following pair of fields appear for each column: 
 * Int32 The length of the column value, in bytes(this count does not 
 *       include itself). Can be zero. As a special case, -1 indicates 
 *       a NULL column value. No value bytes follow in the NULL case.
 * Byten The value of the column, in the format indicated by the associated
 *       format code. n is the above length.
 * </pre>
 * 
 * @author mycat
 */
public class DataRow extends PostgresPacket {

}