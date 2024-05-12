import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "event_list",
    foreignKeys = [
        ForeignKey(entity = EventType::class,
            parentColumns = ["id"],
            childColumns = ["activityTypeId"],
            onDelete = ForeignKey.CASCADE)
    ])
data class EventList(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String, // Название активности
    val description: String, // Описание активности
    val activityTypeId: Int // Тип активности (ссылка на таблицу типов активностей)
)

