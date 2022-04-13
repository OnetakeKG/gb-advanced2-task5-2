package com.gb.advanced2.externals.repo.history.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
const val TABLE_NAME = "search_history"
const val QUERY_NAME = "search_query"
const val COUNT_NAME = "results_count"
const val TIME_NAME = "timestamp"
@Entity(tableName = TABLE_NAME)
data class DbSearchHistoryRecord(
    @PrimaryKey @ColumnInfo(name = QUERY_NAME) val searchQuery: String,
    @ColumnInfo(name = COUNT_NAME) val resultsCount: Int,
    @ColumnInfo(name = TIME_NAME) val timestamp: String,
)
