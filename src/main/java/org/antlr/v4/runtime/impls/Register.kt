package org.antlr.v4.runtime.impls


class Register {

    class FunctionAlreadyExistsException(val procedureID: String) : Exception()

    private val functionRegister: MutableMap<String, Any?> = HashMap()

    @Throws(FunctionAlreadyExistsException::class)
    fun registerFunction(functionId: String, funObject: Any?) {
        if (functionRegister.containsKey(functionId)) {
            throw FunctionAlreadyExistsException(functionId)
        }
        functionRegister[functionId] = funObject
    }

    fun containsFunction(functionId: String?): Boolean {
        return functionRegister.containsKey(functionId)
    }
}