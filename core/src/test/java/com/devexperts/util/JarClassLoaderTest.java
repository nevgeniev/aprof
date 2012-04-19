/*
 *  Aprof - Java Memory Allocation Profiler
 *  Copyright (C) 2002-2012  Devexperts LLC
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.devexperts.util;

import java.io.File;
import java.io.IOException;

/**
 * @author Dmitry Paraschenko
 */
public class JarClassLoaderTest {
	public static void main(String[] args) throws IOException {
		JarClassLoader loader = new JarClassLoader(new File("aprof.jar").toURL());
		System.out.println(loader.getResourceAsStream("details.config"));
		System.out.println(loader.getResource("details.config"));
	}
}
