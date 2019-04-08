package run.halo.app.model.vo;

import run.halo.app.model.dto.CategoryOutputDTO;
import run.halo.app.model.dto.TagOutputDTO;
import run.halo.app.model.dto.post.PostSimpleOutputDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * Post list vo.
 *
 * @author johnniang
 * @date 3/19/19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PostListVO extends PostSimpleOutputDTO {

    private Long commentCount;

    private List<TagOutputDTO> tags;

    private List<CategoryOutputDTO> categories;

}