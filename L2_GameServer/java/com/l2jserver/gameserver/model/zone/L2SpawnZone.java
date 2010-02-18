/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.gameserver.model.zone;

import java.util.List;

import javolution.util.FastList;

import com.l2jserver.gameserver.model.Location;
import com.l2jserver.util.Rnd;

/**
 * Abstract zone with spawn locations
 * @author DS
 *
 */
public abstract class L2SpawnZone extends L2ZoneType
{
	private final List<Location> _spawnLocs;

	public L2SpawnZone(int id)
	{
		super(id);
		_spawnLocs = new FastList<Location>();
	}

	public final void addSpawn(int x, int y, int z)
	{
		_spawnLocs.add(new Location(x, y, z));
	}

	public Location getSpawnLoc()
	{
		return _spawnLocs.get(Rnd.get(_spawnLocs.size()));
	}
}