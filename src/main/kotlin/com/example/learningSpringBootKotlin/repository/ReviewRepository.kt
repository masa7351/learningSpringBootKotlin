package com.example.learningSpringBootKotlin.repository

import com.example.learningSpringBootKotlin.entity.Review
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ReviewRepository : MongoRepository<Review, String>