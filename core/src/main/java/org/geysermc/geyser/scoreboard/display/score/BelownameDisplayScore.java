/*
 * Copyright (c) 2024 GeyserMC. http://geysermc.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 * @author GeyserMC
 * @link https://github.com/GeyserMC/Geyser
 */

package org.geysermc.geyser.scoreboard.display.score;

import org.geysermc.geyser.entity.type.player.PlayerEntity;
import org.geysermc.geyser.scoreboard.Objective;
import org.geysermc.geyser.scoreboard.ScoreReference;
import org.geysermc.geyser.scoreboard.display.slot.DisplaySlot;

public class BelownameDisplayScore extends DisplayScore {
    private final PlayerEntity player;

    public BelownameDisplayScore(DisplaySlot slot, long scoreId, ScoreReference reference, PlayerEntity player) {
        super(slot, scoreId, reference);
        this.player = player;
    }

    @Override
    public void update(Objective objective) {}

    public PlayerEntity player() {
        return player;
    }

    @Override
    public void markUpdated() {
        super.markUpdated();
    }

    public ScoreReference reference() {
        return reference;
    }
}
