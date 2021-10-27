/*
 * Copyright (c) 2021 Kennie<xdpvxv@163.com>
 *
 * The software is licensed under the Mulan PSL v2.
 * You can use this software according to the terms and conditions of the Mulan PSL v2.
 * You may obtain a copy of Mulan PSL v2 at:
 *     http://license.coscl.org.cn/MulanPSL2
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT, MERCHANTABILITY OR FIT FOR A PARTICULAR
 * PURPOSE.
 * See the Mulan PSL v2 for more details.
 */

package com.kennie.library.indexbar;

/**
 * @项目名 KennieIndexBar
 * @类名称 OnLetterChangeListener
 * @类描述 选中字母的回调
 * @创建人 kennie
 * @修改人
 * @创建时间 2021/10/26 21:12
 */
public interface OnLetterChangeListener {


    /**
     * 触摸选中时的回调
     *
     * @param position RecyclerView将要滚动到的位置(-1代表未找到目标位置，则列表不用滚动)
     * @param letter   选中的索引字符
     */
    void onLetterChanged(int position, String letter);

    /**
     * 触摸结束时的回调
     *
     * @param position RecyclerView将要滚动到的位置(-1代表未找到目标位置，则列表不用滚动)
     * @param letter   选中的索引字符
     */
    void onLetterClosed(int position, String letter);
}