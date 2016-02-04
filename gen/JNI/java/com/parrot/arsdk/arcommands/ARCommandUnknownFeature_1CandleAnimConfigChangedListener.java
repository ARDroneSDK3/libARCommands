/*
    Copyright (C) 2014 Parrot SA
    
    Redistribution and use in source and binary forms, with or without
    modification, are permitted provided that the following conditions
    are met:
    * Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in
    the documentation and/or other materials provided with the
    distribution.
    * Neither the name of Parrot nor the names
    of its contributors may be used to endorse or promote products
    derived from this software without specific prior written
    permission.
    
    THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
    "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
    LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
    FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
    COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
    INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
    BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
    OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
    AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
    OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
    OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
    SUCH DAMAGE.
*/
package com.parrot.arsdk.arcommands;

/**
 * Interface for the command <code>CandleAnimConfigChanged</code> in feature <code>UnknownFeature_1</code> listener
 * @author Parrot (c) 2013
 */
public interface ARCommandUnknownFeature_1CandleAnimConfigChangedListener {

    /**
     * Called when a command <code>CandleAnimConfigChanged</code> in feature <code>UnknownFeature_1</code> is decoded
     * @param _speed_is_default 0 if speed is set by user, 1 if default speed is used
     * @param _speed_is_default Candle animation configuration changed.\n\                 This event is only valid when AnimRun type is candle
     * @param _speed The speed of the anim in m/s
     * @param _speed Candle animation configuration changed.\n\                 This event is only valid when AnimRun type is candle
     * @param _vertical_distance_is_default 0 if the vertical distance is set by user, 1 if default value is used
     * @param _vertical_distance_is_default Candle animation configuration changed.\n\                 This event is only valid when AnimRun type is candle
     * @param _vertical_distance Distance that will be made by the product to reach the top of the vertical zoom-out in m
     * @param _vertical_distance Candle animation configuration changed.\n\                 This event is only valid when AnimRun type is candle
     */
    void onUnknownFeature_1CandleAnimConfigChangedUpdate (byte speed_is_default, float speed, byte vertical_distance_is_default, float vertical_distance);
}
