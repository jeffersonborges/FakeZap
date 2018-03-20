package br.com.jborges.fakezap.firebase.fcm

import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService
import com.orhanobut.hawk.Hawk

class MeuFirebaseInstanceIdService: FirebaseInstanceIdService() {
    override fun onTokenRefresh() {
        super.onTokenRefresh() //é chamado quando o token é atualizado
        Hawk.put("TOKENFIREBASE", FirebaseInstanceId.getInstance().token)
    }
}