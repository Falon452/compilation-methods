package com.example.slimp

import org.antlr.v4.runtime.impls.Register
import java.util.HashMap



class Register {

    class ProcedureAlredyExists(val procedureID: String) : Exception()

    private val procedureRegister: MutableMap<String, Any> = HashMap()

    @Throws(Register.FunctionAlreadyExistsException::class)
    fun registerProcedure(procedureID: String, procObject: Any) {
        if (procedureRegister.containsKey(procedureID)) {
            throw Register.FunctionAlreadyExistsException(procedureID)
        }
        procedureRegister[procedureID] = procObject
    }

    fun isProcedure(procedureID: String): Boolean {
        return procedureRegister.containsKey(procedureID)
    }
}