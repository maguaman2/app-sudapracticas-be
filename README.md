"# sudapractic"
https://www.getpostman.com/collections/45a8b933525dd4c05f40

v2_view.sql
------------------------
```
CREATE VIEW activity_detail_view as
  select ad.*,a.description actividad
  from activity_detail ad JOIN activity a ON ad.activities_id = a.id;
```

modelo 
ActivityDetailView
--------------
```
@Entity
@Table(name="activity_detail_view")
class ActivityDetailView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(name="activities_id")
    var activitiesId: Long? = null
    @Column(name="detail_id")
    var detailId: Long? = null
    var actividad: String? = null
}
```

repository
ActivityDetailViewRepository
--------
```
interface ActivityDetailViewRepository: JpaRepository<ActivityDetailView, Long?> {
    fun findById(id: Long?): ActivityDetailView?
    @Query(nativeQuery = true)
    fun listDetailActivity (@Param("detailId") detailId:Long): List<ActivityDetailView>

}
```
agregar al servicio
ActivityDetailService
--------------------------
```
  @Autowired
    lateinit var activityDetailViewRepository: ActivityDetailViewRepository
    
       fun listActivitiesDetailFull (detailId:Long): List<ActivityDetailView>{
        return activityDetailViewRepository.listDetailActivity(detailId)
    }
```    
    
    Agregar al controller
    ActivityDetailController
    -----------------
```    
       @GetMapping("/{detailId}/full")
    fun listFull(@PathVariable("detailId") detailId:Long): List<ActivityDetailView>{
        return activityDetailService.listActivitiesDetailFull(detailId)
    }

```

