package io.dexnet.ethereumkit.spv.net

import io.dexnet.ethereumkit.core.ISpvStorage
import io.dexnet.ethereumkit.core.hexStringToByteArray
import io.dexnet.ethereumkit.network.INetwork
import io.dexnet.ethereumkit.crypto.ECKey
import io.dexnet.ethereumkit.spv.net.les.LESPeer

class PeerProvider(val connectionKey: ECKey,
                   val storage: ISpvStorage,
                   val network: INetwork) {

    fun getPeer(): LESPeer {
        val node = Node(id = "9cfc66931bd30d316b57c4e761a58110d882fc0a6387e26897499be4263cac7cbdb1a8ba43088b8b279ffa84db6c331e7968875191baeecf9d87c1221feec1eb".hexStringToByteArray(),
                host = "212.112.123.197",
                port = 30303,
                discoveryPort = 30301)

        return LESPeer.getInstance(connectionKey, node)
    }

}
