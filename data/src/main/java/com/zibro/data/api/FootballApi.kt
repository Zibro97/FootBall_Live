package com.zibro.data.api

import com.zibro.domain.entity.StatusInfo
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * api-sprots Request 규칙
 * 1. GET 요청에서만 동작하도록 구성
 * 2. 아래 나열된 헤더만 허용
 *      a. x-rapidapi-host
 *      b. x-rapidapi-key
 *      c. x-apisports-key
 * 3. 대회 로고 url https://media.api-sports.io/football/leagues/{league_id}.png
 *
 * */
interface FootballApi {
    //test api Request
    @GET("/status")
    suspend fun status():StatusInfo

    //국가 검색
    @GET("/countries")
    suspend fun countries(
        //국가 명
        @Query("name")
        //국가 알파벳 코드 ex) FR,GB,IT ...
        countryName : String
    )

    //리그 및 컵 목록 검색
    @GET("/leagues")
    suspend fun leagueInfo(
        @Query("name")
        leagueName : String,
    )

    //팀정보 (팀ID, 로고..등)
    @GET("/teams")
    suspend fun teamList(
        @Query("id")
        teamId : Int?,
        @Query("name")
        teamName : String?,
        @Query("league")
        leagueId : Int?,
        @Query("season")
        season : Int?,
        @Query("country")
        country : String?,
        @Query("search")
        keyword : String?
    )

    //팀 통계
    @GET("/teams/statistics")
    suspend fun teamStatistics(
        @Query("league")
        league : Int,
        @Query("season")
        season : Int,
        @Query("team")
        teamId : Int,
        @Query("date")
        dateLimit : String?
    )

    //리그 또는 팀의 테이블
    @GET("standings")
    suspend fun leagueOrTeamTable(
        @Query("league")
        leagueId: Int?,
        @Query("season")
        season: Int,
        @Query("team")
        teamId: Int?
    )


}