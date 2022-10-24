/*******************************************************************************
 *   Copyright (c) 2022  Aditya Bavadekar
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 ******************************************************************************/

package io.github.adityaamolbavadekar.lib

/**
 * Created by Aditya Bavadekar on TODO( DATA HERE )
 *
 * **About** :
 *
 * TODO( DESCRIPTION HERE )
 * It is made by Aditya Bavadekar and written in Kotlin Language.
 * The library is Open-Source with its LICENCE bieng Apache 2.0.
 *
 * **Usage**:
 * TODO( USAGE HERE )
 * ```kt
 * //Example Usage
 * ```
 *
 * @author Aditya Bavadekar
 * @since 19 May 2022
 *
 * */
object MyLibClass {

    fun instance(): Boolean {
        synchronized(MyLibClass::class.java) {
            return true
        }
    }

    internal const val CLASS_TAG = "MyLibClass"

}

