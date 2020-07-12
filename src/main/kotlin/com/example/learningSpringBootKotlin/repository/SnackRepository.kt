package com.example.learningSpringBootKotlin.repository

import com.example.learningSpringBootKotlin.entity.Snack
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SnackRepository : MongoRepository<Snack, String>