package com.example.learningSpringBootKotlin.resolvers

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.example.learningSpringBootKotlin.entity.Snack
import com.example.learningSpringBootKotlin.repository.SnackRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class SnackMutationResolver (private val snackRepository: SnackRepository): GraphQLMutationResolver {
    fun newSnack(name: String, amount: Float): Snack {
        val snack = Snack(name, amount)
        snack.id = UUID.randomUUID().toString()
        snackRepository.save(snack)
        return snack
    }

    fun deleteSnack(id:String): Boolean {
        snackRepository.deleteById(id)
        return true
    }

    fun updateSnack(id:String, amount:Float): Snack {
        val snack = snackRepository.findById(id)
        snack.ifPresent {
            it.amount = amount
            snackRepository.save(it)
        }
        return snack.get()
    }
}