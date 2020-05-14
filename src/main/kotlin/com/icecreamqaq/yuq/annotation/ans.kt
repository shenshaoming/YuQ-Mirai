package com.icecreamqaq.yuq.annotation

import com.IceCreamQAQ.Yu.annotation.EnchantBy
import com.IceCreamQAQ.Yu.annotation.LoadBy_
import com.IceCreamQAQ.Yu.controller.DefaultControllerLoaderImpl
import com.IceCreamQAQ.Yu.loader.enchant.MethodParaNamedEnchanter
import com.icecreamqaq.yuq.controller.BotContextControllerLoader
import com.icecreamqaq.yuq.controller.BotControllerLoader
import javax.inject.Named


@LoadBy_(BotControllerLoader::class)
@EnchantBy(MethodParaNamedEnchanter::class)
@Named("group")
annotation class GroupController

@LoadBy_(BotControllerLoader::class)
@EnchantBy(MethodParaNamedEnchanter::class)
@Named("priv")
annotation class PrivateController

@LoadBy_(BotContextControllerLoader::class)
@EnchantBy(MethodParaNamedEnchanter::class)
annotation class ContextController
annotation class ContextAction(val value:String)
annotation class NextContext(val value: String)
annotation class Save(val value:String = "")

annotation class QMsg(val at: Boolean = false, val reply: Boolean = false)

annotation class PathVar(val value: Int, val type: Type = Type.String) {
    enum class Type {
        Source, String, Integer, Switch, Long, Double
    }
}